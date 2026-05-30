// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationCounter: ImageVector
  get() {
    val current = _notificationCounter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NotificationCounter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 12 v15 H5 V5 h15 V3 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2 V12z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 12
          moveTo(x = 27.0f, y = 12.0f)
          // v 15
          verticalLineToRelative(dy = 15.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 12z
          verticalLineTo(y = 12.0f)
          close()
        }
        // <circle cx="26.5" cy="5.5" radius="3.5" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 26.5 5.5
          moveTo(x = 26.5f, y = 5.5f)
          // m -3.5 0
          moveToRelative(dx = -3.5f, dy = 0.0f)
          // a 3.5 3.5 0 1 1 7 0
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 0.0f,
          )
          // a 3.5 3.5 0 1 1 -7 0z
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _notificationCounter = it }
  }

@Suppress("ObjectPropertyName")
private var _notificationCounter: ImageVector? = null
