// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsSystemGroup: ImageVector
  get() {
    val current = _cicsSystemGroup
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CicsSystemGroup",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 h-5 v2 h5 v24 h-5 v2 h5 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M14 17 H8 a.94 .94 0 0 0 -1 1 v6 a.94 .94 0 0 0 1 1 h6 a.94 .94 0 0 0 1 -1 v-6 a.94 .94 0 0 0 -1 -1 m-1 6 H9 v-4 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // M 14 17
          moveTo(x = 14.0f, y = 17.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 0.94 0.94 0 0 0 -1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 0.94 0.94 0 0 0 1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 0.94 0.94 0 0 0 1 -1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 0.94 0.94 0 0 0 -1 -1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m -1 6
          moveToRelative(dx = -1.0f, dy = 6.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // M25 24 v-6 a.94 .94 0 0 0 -1 -1 h-6 a.94 .94 0 0 0 -1 1 v6 a.94 .94 0 0 0 1 1 h6 a1 1 0 0 0 1 -1 m-2 -1 h-4 v-4 h4Z M14 7 H8 a.94 .94 0 0 0 -1 1 v6 a.94 .94 0 0 0 1 1 h6 a.94 .94 0 0 0 1 -1 V8 a.94 .94 0 0 0 -1 -1 m-1 6 H9 V9 h4Z m5 2 h6 a.94 .94 0 0 0 1 -1 V8 a.94 .94 0 0 0 -1 -1 h-6 a.94 .94 0 0 0 -1 1 v6 a1 1 0 0 0 1 1 m1 -6 h4 v4 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 24
          moveTo(x = 25.0f, y = 24.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 0.94 0.94 0 0 0 -1 -1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 0.94 0.94 0 0 0 -1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 0.94 0.94 0 0 0 1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // m -2 -1
          moveToRelative(dx = -2.0f, dy = -1.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 14 7
          moveTo(x = 14.0f, y = 7.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 0.94 0.94 0 0 0 -1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 0.94 0.94 0 0 0 1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 0.94 0.94 0 0 0 1 -1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 0.94 0.94 0 0 0 -1 -1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m -1 6
          moveToRelative(dx = -1.0f, dy = 6.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 5 2
          moveToRelative(dx = 5.0f, dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 0.94 0.94 0 0 0 1 -1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 0.94 0.94 0 0 0 -1 -1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 0.94 0.94 0 0 0 -1 1
          arcToRelative(
            a = 0.94f,
            b = 0.94f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // m 1 -6
          moveToRelative(dx = 1.0f, dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M4 4 h5 V2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h5 v-2 H4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
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
      .also { _cicsSystemGroup = it }
  }

@Suppress("ObjectPropertyName")
private var _cicsSystemGroup: ImageVector? = null
