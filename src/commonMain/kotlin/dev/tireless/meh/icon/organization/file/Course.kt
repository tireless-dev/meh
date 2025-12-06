// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Course: ImageVector
  get() {
    val current = _course
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Course",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 30 H8 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v16.62 l-5 -2.5 -5 2.5 V4 H8 v24 h16 v-4 h2 v4 a2 2 0 0 1 -2 2 m-3 -14.12 3 1.5 V4 h-6 v13.38Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 30
          moveTo(x = 24.0f, y = 30.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 16.62
          verticalLineToRelative(dy = 16.62f)
          // l -5 -2.5
          lineToRelative(dx = -5.0f, dy = -2.5f)
          // l -5 2.5
          lineToRelative(dx = -5.0f, dy = 2.5f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m -3 -14.12
          moveToRelative(dx = -3.0f, dy = -14.12f)
          // l 3 1.5
          lineToRelative(dx = 3.0f, dy = 1.5f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 13.38z
          verticalLineToRelative(dy = 13.38f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
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
      .also { _course = it }
  }

@Suppress("ObjectPropertyName")
private var _course: ImageVector? = null
