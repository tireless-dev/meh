// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Constraint: ImageVector
  get() {
    val current = _constraint
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Constraint",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 13 V5 h-4 V3 h4 a2 2 0 0 1 2 2 v8 c0 1.52 .88 2 2 2 v2 c-1.12 0 -2 .45 -2 2 v8 a2 2 0 0 1 -2 2 h-4 v-2 h4 v-8 c0 -1.68 .88 -2.56 2 -2.86 v-.27 c-1.12 -.29 -2 -1.19 -2 -2.87
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 13
          moveTo(x = 27.0f, y = 13.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // c 0 1.52 0.88 2 2 2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.52f,
            dx2 = 0.88f,
            dy2 = 2.0f,
            dx3 = 2.0f,
            dy3 = 2.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // c -1.12 0 -2 0.45 -2 2
          curveToRelative(
            dx1 = -1.12f,
            dy1 = 0.0f,
            dx2 = -2.0f,
            dy2 = 0.45f,
            dx3 = -2.0f,
            dy3 = 2.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // c 0 -1.68 0.88 -2.56 2 -2.86
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.68f,
            dx2 = 0.88f,
            dy2 = -2.56f,
            dx3 = 2.0f,
            dy3 = -2.86f,
          )
          // v -0.27
          verticalLineToRelative(dy = -0.27f)
          // c -1.12 -0.29 -2 -1.19 -2 -2.87
          curveToRelative(
            dx1 = -1.12f,
            dy1 = -0.29f,
            dx2 = -2.0f,
            dy2 = -1.19f,
            dx3 = -2.0f,
            dy3 = -2.87f,
          )
        }
        // <rect width="8" height="8" x="12.0" y="12.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 12 12
          moveTo(x = 12.0f, y = 12.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // M5 13 V5 h4 V3 H5 a2 2 0 0 0 -2 2 v8 c0 1.52 -.88 2 -2 2 v2 c1.12 0 2 .45 2 2 v8 a2 2 0 0 0 2 2 h4 v-2 H5 v-8 c0 -1.68 -.88 -2.56 -2 -2.86 v-.27 c1.12 -.29 2 -1.19 2 -2.87
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5 13
          moveTo(x = 5.0f, y = 13.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // c 0 1.52 -0.88 2 -2 2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.52f,
            dx2 = -0.88f,
            dy2 = 2.0f,
            dx3 = -2.0f,
            dy3 = 2.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // c 1.12 0 2 0.45 2 2
          curveToRelative(
            dx1 = 1.12f,
            dy1 = 0.0f,
            dx2 = 2.0f,
            dy2 = 0.45f,
            dx3 = 2.0f,
            dy3 = 2.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // c 0 -1.68 -0.88 -2.56 -2 -2.86
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.68f,
            dx2 = -0.88f,
            dy2 = -2.56f,
            dx3 = -2.0f,
            dy3 = -2.86f,
          )
          // v -0.27
          verticalLineToRelative(dy = -0.27f)
          // c 1.12 -0.29 2 -1.19 2 -2.87
          curveToRelative(
            dx1 = 1.12f,
            dy1 = -0.29f,
            dx2 = 2.0f,
            dy2 = -1.19f,
            dx3 = 2.0f,
            dy3 = -2.87f,
          )
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
      .also { _constraint = it }
  }

@Suppress("ObjectPropertyName")
private var _constraint: ImageVector? = null
