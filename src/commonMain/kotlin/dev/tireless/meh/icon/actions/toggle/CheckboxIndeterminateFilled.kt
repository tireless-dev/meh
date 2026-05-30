// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckboxIndeterminateFilled: ImageVector
  get() {
    val current = _checkboxIndeterminateFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CheckboxIndeterminateFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m-4 14 H10 v-4 h12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -4 14
          moveToRelative(dx = -4.0f, dy = 14.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
        }
        // M22 18 H10 v-4 h12Z
        path {
          // M 22 18
          moveTo(x = 22.0f, y = 18.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
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
      .also { _checkboxIndeterminateFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _checkboxIndeterminateFilled: ImageVector? = null
