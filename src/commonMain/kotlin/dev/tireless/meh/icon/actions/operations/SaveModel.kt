// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SaveModel: ImageVector
  get() {
    val current = _saveModel
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SaveModel",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m26 20 1.43 1.9 L23 26.96 l-4.43 -5.06 L20 20z m1 -2 h-8 l-3 4 7 8 7 -8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 20
          moveTo(x = 26.0f, y = 20.0f)
          // l 1.43 1.9
          lineToRelative(dx = 1.43f, dy = 1.9f)
          // L 23 26.96
          lineTo(x = 23.0f, y = 26.96f)
          // l -4.43 -5.06
          lineToRelative(dx = -4.43f, dy = -5.06f)
          // L 20 20z
          lineTo(x = 20.0f, y = 20.0f)
          close()
          // m 1 -2
          moveToRelative(dx = 1.0f, dy = -2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // l -3 4
          lineToRelative(dx = -3.0f, dy = 4.0f)
          // l 7 8
          lineToRelative(dx = 7.0f, dy = 8.0f)
          // l 7 -8z
          lineToRelative(dx = 7.0f, dy = -8.0f)
          close()
        }
        // M16 26 h-4 v-8 h2 v-2 h-2 a2 2 0 0 0 -2 2 v8 H6 V6 h4 v4 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V6.41 l4 4 V16 h2 v-6 a1 1 0 0 0 -.29 -.71 l-5 -5 A1 1 0 0 0 22 4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h10Z M12 6 h8 v4 h-8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // V 6.41
          verticalLineTo(y = 6.41f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 1 1 0 0 0 -0.29 -0.71
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.29f,
            dy1 = -0.71f,
          )
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // A 1 1 0 0 0 22 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 4.0f,
          )
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
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // M 12 6
          moveTo(x = 12.0f, y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
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
      .also { _saveModel = it }
  }

@Suppress("ObjectPropertyName")
private var _saveModel: ImageVector? = null
